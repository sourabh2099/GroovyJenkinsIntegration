import groovy.util.GroovyScriptEngine

static void main(String[] args) {

    readFromFileSystem();
}

def readFromFileSystem() {
    def dir = new File("/home/sourabh/Documents/GroovyTestProj/src/main/resources/");

    def fileData = [];
//    dir.traverse(type: ANY, maxDepth: 2) {
//        files.add(it)
//    };
//    def files = getFileDataForDirectory();
    callRestService("files");

}

//private String[] getFileDataForDirectory() {
//    def fileData = [];
//    for (File file in files) {
//        if (file.isFile()) {
//            fileData.add(file.getText("UTF-16"));
//        }
//    }
//    return fileData;
//}

def void callRestService(String[] strings) {
    def result = sh(
            script: '''
            curl --location 'http://localhost:8888/test' \
            --header 'Content-Type: application/json' \
            --data '{ "key": "value" }'
        ''',
            returnStatus: true
    )
    println(result)
}

