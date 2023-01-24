public class CheckLanguage {
    response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] languages = request.getCookies();
		if(languages != null) {
			for(int i = 0;i < languages.length;i++) {
				Cookie language = languages[i];
				if(language.getName().equals("language")) {
					String dataLang = language.getValue();
					if(dataLang.equals("en")) {
						out.println("Welcome");
						break;
					}else if(dataLang.equals("th")) {
						out.println("ยินดีต้อนรับ");
						break;
					}else {
						out.println("ไม่มีภาษา No Language");
						break;
					}
				}
			}
			}
}
