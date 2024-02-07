def call(Map config = [:]){
    loadLinuxScript(name: "hello-world.py" )
    sh "./hello-world.py ${config.name} ${config.dayofWeek}" 
    }
