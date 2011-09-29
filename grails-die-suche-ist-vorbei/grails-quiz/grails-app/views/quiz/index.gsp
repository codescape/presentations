<html>
<head>
    <meta name="layout" content="main">
</head>
<body>
<div class="body">
    <h1>Grails Quiz</h1>
    <div id="results" class="message" style="display:none"></div>

    <g:each in="${questionList}" var="question" status="index">
    <p>
        <h2>${question.text}</h2>
        <ul>
            <g:each in="${question.answers}" var="answer">
            <li><g:remoteLink action="answer" id="${answer.id}" update="results" onSuccess="showResults()">${answer.text}</g:remoteLink></li>
            </g:each>
        </ul>
    </p>
    </g:each>
</div>
</body>
</html>