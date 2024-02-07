def call(Map config = [:]){
    loadPythonScript(name: "hello-world.py" )
    sh "cat  hello-world.py"
    sh "python -m hello-world.py ${config.name} ${config.dayofWeek}" 
    }
