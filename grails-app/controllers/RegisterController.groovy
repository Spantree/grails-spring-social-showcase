import grails.plugins.springsocial.connect.web.GrailsConnectSupport

import org.springframework.social.connect.ConnectionFactoryLocator
import org.springframework.social.connect.UserProfile
import org.springframework.social.connect.web.ProviderSignInAttempt
import org.springframework.social.linkedin.api.LinkedIn
import org.springframework.social.twitter.api.Twitter


class RegisterController {
	ConnectionFactoryLocator connectionFactoryLocator
	def connectionRepository
	def signInService
	def usersConnectionRepository
	def requestCache
	GrailsConnectSupport webSupport = new GrailsConnectSupport(mapping: "springSocialRegister")
	Twitter twitter
	LinkedIn linkedin
	
	
	def oauthCallback() {
		ProviderSignInAttempt attempt = session[ProviderSignInAttempt.SESSION_ATTRIBUTE]
		UserProfile profile = attempt.connection.fetchUserProfile()
		render "firstName: ${profile.firstName}, lastName: ${profile.lastName}"
	}
}
