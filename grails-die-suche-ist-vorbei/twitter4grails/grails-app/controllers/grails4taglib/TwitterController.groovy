package grails4taglib

import grails.converters.JSON
import grails.converters.XML

class TwitterController {

    def status = {
        withFormat {
            html { [statusList: Status.list()]}
            json { render Status.list() as JSON }
            xml { render Status.list() as XML }
        }
    }

}
