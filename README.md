> Ishaan Takrani

## Installing Vendor Libraries

To resolve issues with dependencies, such as, if an import
cannot be resolved, a library may need to be added.

To add a library, open the command pallete in WPIlib's VSCode, and navigate to the following:
Manage Vendor Libraries > Install new libraries (online)

The libraries that we will use are below, including the .json that must be imported, and the API docs.

|Library|URL|API Docs|
|--|--|--|
|CTRE Phoenix v5|https://maven.ctr-electronics.com/release/com/ctre/phoenix/Phoenix5-frc2024-latest.json|https://api.ctr-electronics.com/phoenix/release/java/|
|CTRE Phoenix v6|https://maven.ctr-electronics.com/release/com/ctre/phoenix6/latest/Phoenix6-frc2024-latest.json|https://api.ctr-electronics.com/phoenix6/release/java/|


From here, paste the URL for the json file associated with the library.
Libraries can be found [here](https://docs.wpilib.org/en/stable/docs/software/vscode-overview/3rd-party-libraries.html#libraries)

[this](https://github.com/Mars1523/FRC-Vendor-Libraries?tab=readme-ov-file) GitHub repo features some commonly used ones (Phoenix v5, Phoenix v6, REVLib, NavX, libgrapplefrc2024, WPILibNewCommands)
