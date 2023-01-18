package cars.api.dtos;

public record CarDTO(
    String modelo,
    String fabricante,
    String dataFabricacao,
    Double valor,
    Integer anoModelo
    ){}


