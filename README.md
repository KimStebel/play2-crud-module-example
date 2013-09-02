play2-crud-module-example
=========================

usage examples for crud module, see https://github.com/KimStebel/play2-crud-module


From the code:
--------------------

case "show"::id::Nil if request.method == "GET" => controller.show(id)
case "showAll"::Nil if request.method == "GET" => controller.showAll
case "create"::Nil if request.method == "POST" => controller.create(request)
case "create"::Nil if request.method == "GET" => controller.createForm
case "update"::id::Nil if request.method == "POST" => controller.update(id, request)
case "update"::id::Nil if request.method == "GET" => controller.updateForm(id)
case "delete"::id::Nil if request.method == "POST" => controller.delete(id)

you can do 

/person/create
/person/showAll etc.
