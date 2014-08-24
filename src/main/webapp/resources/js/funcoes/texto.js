(function($) {

$().ready(function() {
        
     $.extend({
        limitarTexto : function(texto, tamanho){return (texto.length > tamanho) ? texto.substr(0, tamanho) + '...' : texto;}
     });
         
});

})(jQuery);