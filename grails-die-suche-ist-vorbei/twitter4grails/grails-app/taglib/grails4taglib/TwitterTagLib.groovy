package grails4taglib

class TwitterTagLib {

    static namespace = "twitter"

    def displayStatus = { attrs, body ->
        def status = attrs.status as Status
        out << """
            <div class="status">
                <span>${status.poster.username} posted on ${g.formatDate(date: status.dateCreated)}:</span>
                <p>${status.message}</p>
            </div>"""
    }

}
