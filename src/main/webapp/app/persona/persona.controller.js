(function() {
	'use strict';

	angular
		.module('restEasyApp')
		.controller('PersonaController', PersonaController);

	PersonaController.$inject = ['PersonaService'];

	function PersonaController (PersonaService) {
		var vm = this;

		vm.personas = PersonaService.query();

	}
})();


// angular.module('restEasyApp', [])
// 	.controller('PersonaController', ['PersonaService', function (PersonaService) {
// 		var vm = this;
// 		vm.personas = PersonaService.query();
// }]);