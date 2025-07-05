package W2_JUnit_Mockito.MOCKITOExercises.Exc2_VerifyingInteractions;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
