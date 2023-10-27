package API_Restful.Products_API.dtos;

import API_Restful.Products_API.UserSecurityProduct.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {

} 
