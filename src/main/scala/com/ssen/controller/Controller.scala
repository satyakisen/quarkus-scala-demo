package com.ssen.controller


import com.ssen.service.JobService

import javax.inject.Inject
import javax.ws.rs.core.MediaType
import javax.ws.rs.{Consumes, GET, Path, Produces}

@Path("/")
@Produces(Array[String](MediaType.APPLICATION_JSON))
@Consumes(Array[String](MediaType.APPLICATION_JSON))
class Controller{

    @Inject
    protected var svc: JobService = _

    @GET
    def hello() = svc.getName
}