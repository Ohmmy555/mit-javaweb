String lang = request.getParameter("lang");
		Cookie language = new Cookie("language",lang);
		language.setMaxAge(30*60);
		response.addCookie(language);