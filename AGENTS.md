# AGENTS.md

This repository is a Java assignment for arrays and matrices in the `no.hvl.dat100` packages. The main implementation work happens in the starter classes under `src/main/java` and is validated by JUnit tests under `src/test/java`.

## Project context

- Assignment brief: [README.md](README.md)
- Build/test tool: Maven (`pom.xml`)
- Main implementation files:
  - `src/main/java/no/hvl/dat100/tabeller/Tabeller.java`
  - `src/main/java/no/hvl/dat100/matriser/Matriser.java`
- Test files:
  - `src/test/java/no/hvl/dat100/tabeller/TabellerEnhetsTests.java`
  - `src/test/java/no/hvl/dat100/matriser/MatriserEnhetsTests.java`

## Working conventions

- Preserve the package declarations and method signatures exactly as defined in the starter files.
- These are static utility methods; do not add instance state or change the public API.
- Remove the `UnsupportedOperationException` only after implementing the method.
- Do not use `java.util.Arrays` helper methods for solving these tasks; the assignment explicitly says that these methods should be implemented from scratch.
- Handle empty arrays and empty matrices correctly; the tests verify edge cases such as length `0`.
- For methods that return a new structure (for example `reverser`, `skaler`, `speile`, `multipliser`), allocate a new array instead of mutating the input.
- Keep output formatting exact to the test expectations, including brackets, commas, and newline characters.

## Validation

Run this from the repository root to verify the assignment:

```bash
mvn test
```

This project is expected to pass once the array and matrix implementations are complete.

## Scope for coding agents

- Prefer focused work in `Tabeller.java` and `Matriser.java`.
- Keep edits minimal and directly tied to the assignment requirements.
- Do not change tests unless the assignment explicitly asks to skip optional methods.
- If optional matrix methods are left unimplemented, keep the corresponding test expectations in mind and do not alter the repo beyond the required implementation work.
