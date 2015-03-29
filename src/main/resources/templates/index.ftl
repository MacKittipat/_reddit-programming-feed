<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Reddit Programming Feed</title>
    </head>
    <body>
        <#list redditFeedDataChildrenModelList as redditFeedDataChildrenModel>
            <div>
                ${redditFeedDataChildrenModel.data.title}
            </div>
        </#list>
    </body>
</html>