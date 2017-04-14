### REST Service

**Extension point description**: Lets developers create custom JAX-RS standard
based RESTful services.

**Template project description**: Demonstrates how to create a JAX-RS service
that lists Liferay users.

**NOTE:** Before this service is accessible, the developer needs to configure
endpoints for it. To do so, go to the Control Panel &rarr; *System* &rarr;
*System Settings* &rarr; *Foundation* and then

* Search for CXF Endpoints
* Create a new *CXFEndpoint publisher configuration* providing a context path
  (e.g., `/rest-test`).
* Go back to *System Settings* &rarr; *Foundation* and select *REST Extender*.
* Create a new REST extender configuration (i.e., search with `rest`) providing
  context paths (e.g., `/rest-test`) and `jaxrs.applications.filters` set to
  `(jaxrs.application=true)`.

Then you can access the service via
[http://localhost:8080/o/rest-test/users/list/](http://localhost:8080/o/rest-test/users/list/).