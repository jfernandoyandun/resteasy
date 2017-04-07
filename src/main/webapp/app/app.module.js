(function() {
	'use strict';

	angular
		.module('restEasyApp', [
			'ngResource',
			'ui.bootstrap'
		])
		.run(run);
})();
