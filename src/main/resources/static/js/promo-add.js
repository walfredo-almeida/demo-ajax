//funcao para capturar as metatags
 $("#linkPromocao").on('change', function(){
	var url = $(this).val();
	
	if (url.length >7){
		$.ajax({
			method: "POST",
			url: "/meta/info?url=" + url,
			cache: false,
			success: function( data ){
				console.log(data);
				$("#titulo").val(data.title);
				$("#site").text(data.site);
				$("#linkImagem").attr("src", data.image);
			},
			statusCode: {
				404: function() {
					$("#alert").addClass("alert alert-danger").text("Nenhuma variavel encontrada");
				}
			},
			error: function(){
				$("#alert").addClass("alert alert-danger").text("Ops... algo deu errado, tente mais tarde");
			}
		});
	}	
});
