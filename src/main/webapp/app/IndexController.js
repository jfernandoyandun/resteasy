angular.module('se')
	.controller("IndexController", ["$scope", "$translate", function($scope, $translate){
		
		var value;
		$scope.translations={};
		
		$translate ( "index.legend" ).then( function(data){
			$scope.translations.legend=data;			
		});
		
		$scope.now=function(){
			return new Date();
		};
		
		$scope.how = function (){
			if(!value){
				value= (Math.random()*100).toFixed(2);
			}
			return value;
		};
		
	}]);