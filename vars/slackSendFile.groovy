def call(Map config = [:]){
    sh 'curl https://slack.com/api/files.upload  -H "Authorization: '+config.token+'" -F file=@'+config.filePath+' -F channels=#'+config.channel+' -F "initial_comment='+config.initialComment+'"'
}