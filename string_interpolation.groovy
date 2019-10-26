import groovy.transform.CompileStatic

// def firstname = "Pila"

// def fullname = "Louis ${firstname}" //? string interpolation

// println fullname


@CompileStatic
int doubleIt(int num){
    num * 2
}

assert doubleIt(2) == 4

