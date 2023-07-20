using Microsoft.Extensions.Configuration;

public class OracleDataAccess
{
    private readonly IConfiguration _configuration;

    public OracleDataAccess(IConfiguration configuration)
    {
        _configuration = configuration;
    }

    public void ConnectAndQueryDatabase()
    {
        string connectionString = _configuration.GetConnectionString("DefaultConnection");

        using (OracleConnection connection = new OracleConnection(connectionString))
        {
            connection.Open();

            // Agora você pode executar suas consultas SQL ou comandos no banco de dados Oracle usando esta conexão.
            // Exemplo:
            using (OracleCommand command = connection.CreateCommand())
            {
                command.CommandText = "SELECT * FROM sua_tabela";
                using (OracleDataReader reader = command.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        // Processar os dados lidos do banco de dados
                    }
                }
            }
        }
    }
}
