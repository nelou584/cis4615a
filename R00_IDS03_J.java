//IDS03-J. Do not log unsanitized user input Given the non-compliant code below:

if (login Successful){
  logger.severe("User login succeeded for: " + sanitizeUser(username)};
  } else {
    logger.severe("User login failed for: " + sanitizeUser(username)};
}

public String sanitizeUser(String username){
  return Pattern.matches("[A-Za-z0-9_]+", username))
    ? username : "unauthorized user";
}
