def call(Map config = [:]){
    def scriptContent = libraryResource "python/${config.name}"
    writeFile file: "${config.name}", text: scriptContent
    sh "chmod a+x ./${config.name}"
    
    }
