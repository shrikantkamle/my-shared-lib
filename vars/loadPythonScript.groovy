def call(Map config = [:]){
    def scriptContent = libraryResource "linux/${config.name}"
    writeFile file: "${config.name}", text: scriptContent
    sh "chmod a+x ./${config.name}"
    
    }
