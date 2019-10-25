import groovy.json.JsonSlurper

def slurper = new JsonSlurper()

def result = slurper.parseText('{"person": {"name":"John Doe", "age":"40", "gender": "male", "cars":["ford", "Toyota"]}}')

println result.person.name
println result.person.age
println result.person.cars.size()


//?List

authors = ["asobo", "Penn", "Teneng"]

println authors[0]

//? String Interpolation
String firstname = "Pila";

String fullname = "Louis " + firstname;

System.out.println(fullname);


