//funcao para capturar as metatags
 $("#linkPromocao").on('change', function(){
	var url = $(this).val();
	
	if (url.length >7){
		$.ajax({
			method: "POST",
			url: "/meta/info?url=" + url,
			cache: false,
			beforeSend: function( ){
				$("#alert").removeClass("alert alert-danger").text('');
				$("#titulo").val("");
				$("#site").text("");
				$("#linkImagem").attr("src", "");
				$("#loader-img").addClass("loader");
				$("#preco").val("");
			},
			success: function( data ){
				console.log(data);
				$("#titulo").val(data.title);				
				$("#site").text(data.site.replace("@",""));
				$("#linkImagem").attr("src", data.image);
				$("#preco").val(data.price);
			},
			statusCode: {
				404: function() {
					$("#alert").addClass("alert alert-danger").text("Nenhuma variavel encontrada neste site");
					$("#linkImagem").attr("src", "/images/promo-dark.png");
				}
			},
			error: function(){
				$("#alert").addClass("alert alert-danger").text("Ops... algo deu errado, tente mais tarde");
				$("#linkImagem").attr("src", "/images/promo-dark.png");
			},
			complete: function(){
				$("#loader-img").removeClass("loader");
			}
		});
	}	
});
