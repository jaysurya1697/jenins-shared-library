def call(Map config = [:]){
  sh 'echo ${config.a} , ${config.b}'
}
