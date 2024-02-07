def call(Map config = [:]){
    loadLinuxScript(name: "hello-world.py" )
    sh "python hello-world.py ${config.name} ${config.dayofWeek}" 
    }
