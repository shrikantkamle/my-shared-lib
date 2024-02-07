def call(Map config = [:]){
    loadPythonScript(name: "hello-world.py" )
    sh "cat  hello-world.py"
    sh "pwd"
    sh "python3 hello-world.py ${config.name} ${config.dayofWeek}" 
    
    }
