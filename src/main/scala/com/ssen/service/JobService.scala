package com.ssen.service

import javax.annotation.PostConstruct
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class JobService {
  private[this] var name: String = _

  @PostConstruct
  def init() : Unit ={
    name = "Hello"
  }

  def getName: String= name
}
