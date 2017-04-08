(function() {
	angular.module('restEasyApp').service('PersonaService', PersonaService);

	PersonaService.$inject = [ '$resource'];

	function PersonaService($resource) {
		return $resource('rest/persona/:id');
	}
})();