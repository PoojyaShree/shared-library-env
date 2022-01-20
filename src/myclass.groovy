/*MyClass(def script) {
  throw new Exception("FOO=${script.env.FOO}")
}*/
class myclass implements Serializable {
  void mymethod(steps) {
    String myEnvVar = steps.sh(returnStdout: true, script: "env | grep 'myVar' | cut -f 2- -d '='")
  }
}
