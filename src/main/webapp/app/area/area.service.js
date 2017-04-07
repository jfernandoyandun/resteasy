(function() {
	angular.module('se').service('AreaService', areaService);	

		areaService.$inject = [ '$resource'];

	function areaService($resource) {//single responsability
		return $resource('../rest/area/:id');
	}
})();