package ch.hsr.servicestoolkit;

public class UrlHelper {
	private static final String HOST = "http://localhost:";
	private static final String SOLVER_PATH = "/engine/solver/";
	private static final String IMPORTER_PATH = "/engine/import/";

	public static String importDomain(final int port) {
		return HOST + port + "/engine/import";
	}

	public static String userRepresentations(final Integer modelId, final int port) {
		return HOST + port + IMPORTER_PATH + modelId.toString() + "/userrepresentations/";
	}

	public static String solve(final Integer modelId, final int port) {
		return HOST + port + SOLVER_PATH + modelId;
	}
}
