package com.example

import grails.web.mime.MimeType

class MimeTypes {
    public static final MimeType MINIMAL = new MimeType('application/vnd.example.minimal+json', "minimal")
    public static final MimeType EXPORT = new MimeType('application/vnd.example.export+json', "export")
}
