<!DOCTYPE html>
<html>
    <head>
        <title>${person.name}</title>
    </head>
    <body>
        <h1 title="${person.name}">${person.name}</h1>
        <#if person.married>
            <h2 title="${person.spouse}">Spouse: ${person.spouse}</h2>
        </#if>
        <#list person.children as child>
            <div>${child}</div>
        </#list>
    </body>
</html>
