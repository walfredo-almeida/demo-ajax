

var pageNumber = 0;

$(document).ready(function(){
	$("#loader-img").hide();
	$("#fim-btn").hide();
	
})
// efeito infinite scroll
$(window).scroll(function(){
	var scrollTop = $(this).scrollTop();
	var conteudo = $(document).height() - $(window).height();
	
	//console.log("scrollTop:", scrollTop, "|", "conteudo", conteudo);
	
	if (scrollTop >= conteudo){
		pageNumber++
		setTimeout(function(){
			loadByScrollBar(pageNumber)
		}, 200)
	}	
});

function loadByScrollBar(pageNumber){
	
	$.ajax({
		mefthod: "GET",
		url: "/promocao/list/ajax",
		data: {
			page: pageNumber
		},
		beforSend: function(){
			$("#loader-img").show();
		},
		success: function(response){
		//	console.log("resposta >", response);	
			if (response.length > 150) {
			
			$(".row").fadeIn(250,function(){
				$(this).append(response);
			}); 
			}else {
				$("#fim-btn").show();
				$("#loader-img").removeClass("loader");
			}
		},
		error: function(xhr){
			alert("Ops, ocorreu um erro: " + xhr.status + "-"+xhr.statusText);
		},
		complete: function(){
			$("#loader-img").hide();
		}
		
	})
	
}