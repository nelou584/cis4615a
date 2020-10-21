//IDS03-J. Do not log unsanitized user input Given the non-compliant code below:

if (login Successful){
  logger.severe("User login succeeded for: " + username};
  } else {
    logger.severe("User login failed for: " + username};
}
