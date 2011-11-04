<html>
<head>
    <title>Status Feed</title>
    <meta name="layout" content="main">
</head>

<body>

<div class="content">
    <h1>Status Feed</h1>
    <ul>
        <g:each in="${statusList}" var="status">
            <twitter:displayStatus status="${status}"/>
        </g:each>
    </ul>

    <style>
        .status {
            border: 1px solid #eee;
            padding:  5px;
            border-radius: 5px;
            margin: 10px 20px;
        }
        .status span {
            font-style: italic;
        }
    </style>
</div>
</body>
</html>