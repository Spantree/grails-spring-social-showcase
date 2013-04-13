package com.chido

class DemoController {

  def index = { }
  
  def fb = {
    render view: 'facebook'
  }
  
  def tw = {
    render view: 'twitter'
  }
  
  def ln = {
	  render view: 'linkedin'
	}
}
