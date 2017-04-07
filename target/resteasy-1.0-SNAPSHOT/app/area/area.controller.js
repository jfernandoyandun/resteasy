(function() {
	angular.module('se').controller('AreaController', areaController);

	function areaController(AreaService) {
		var vm = this;
		vm.title="Página en español";
		vm.nuevo=nuevo;		
		vm.obtener=obtener;
		vm.eliminar=eliminar;
		vm.comprobar=comprobar;
		vm.registro = new AreaService();		
		function nuevo() {
			vm.registro.$save({}, function(value, header) {
				vm.areas = AreaService.query();
				vm.registro = new AreaService();
			}, function(httpResponse) {
				alert(httpResponse);
			});
		};				
	    vm.areas = AreaService.query();
	    function obtener(idArea) {
	    	AreaService.get({
				id : idArea
			}, function(value, header) {				
				vm.registro = value;
			}, function(httpResponse) {
				alert(httpResponse);
			});
		}
	    function eliminar(area){
			AreaService.remove({
				id:area.idArea
			}, function(value, header) {
				vm.areas = AreaService.query();			
			}, function(httpResponse) {
				alert(httpResponse);
			});
		}	    
	    function comprobar(){
	    	var languageFilePath = '/translations/translation_' + vm.language + '.json';
			console.log(languageFilePath);
	    }
	}
	areaController.$inject = [ 'AreaService' ];

})();