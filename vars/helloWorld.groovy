def call(Map config = [:]){
    sh "echo Hi ${config.name}. Today is ${config.dayofWeek}..."
}
