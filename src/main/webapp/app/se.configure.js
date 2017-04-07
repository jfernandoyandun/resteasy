angular
			.module("se")
			.config(
					[
							"$translateProvider",
							function($translateProvider) {

								$translateProvider
										.translations(
												"es-es",
												{
													"index" : {
														"title" : "i18nAppAAAA",
														"subtitle" : "Usando angular-translate en nuestra aplicacion AngularJS",
														"legend" : "Una forma sencilla de implementar internacionalizacion",
														"idioma" : "Español",
														"manejo" : "Manejo de Areas",
														"nombre" : "Nombre:",
														"descripcion" : "Descripción:",
														"guardar" : "Guardar",
														"lista" : "Lista de Areas",
														"area" : "Área",
														"cargar" : "Cargar",
														"eliminar": "Eliminar"
													}
												});						

								$translateProvider
										.translations(
												"en-us",
												{
													"index" : {
														"title" : "i18nApp",
														"subtitle" : "Using angular-translate in our AngularJS application",
														"legend" : "A simple way to implement internationalization",
														"idioma" : "English",
														"manejo" : "Areas Maintenance",
														"nombre" : "Name:",
														"descripcion" : "Description:",
														"guardar" : "Save",
														"lista" : "Areas List",
														"area" : "Area",
														"cargar" : "Charge",
														"eliminar": "Remove"
													}
												});

							} ]);

	angular
			.module("se")
			.config(
					[
							"tmhDynamicLocaleProvider",
							function(tmhDynamicLocaleProvider) {
								tmhDynamicLocaleProvider
										.localeLocationPattern("../vendor/angular-locale_{{ locale }}.js");
							} ]);

	angular
			.module("se")
			.run(
					[
							"$window",
							"$translate",
							"tmhDynamicLocale",
							function($window, $translate, tmhDynamicLocale) {
								var language = ($window.navigator.userLanguage || $window.navigator.language)
										.indexOf("en") == 0 ? "en-us" : "es-es";
								alert(language);
								$translate.use(language);
								tmhDynamicLocale.set(language);

							} ]);
