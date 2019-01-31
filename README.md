# Modeling Languages for Model-driven Microservice Development

This repository contains the viewpoint-specific MSA modeling languages being described in our book chapter entitled "On Model-driven Microservice Development", which has been submitted to the [Microservices: Science and Engineering - Call for Contributed Chapters] published by Springer.

Please follow these steps if you want to try out the modeling languages on the basis of the case study example described in the paper:
1. Download the [Eclipse Oxygen IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/oxygen/3a/eclipse-ide-java-and-dsl-developers).
2. Clone the repository to your harddrive.
3. Run the downloaded Eclipse package by starting the ``eclipse`` executable.
4. In the popup dialog, choose an arbitrary workspace location on your harddrive and hit the ``Launch`` button.
5. In the IDE, choose the menu entry ``File > Open Projects from File System...``.
6. In the popup dialog, select the folder of the cloned repository as ``Import Source`` and deselect the ``case-study-example`` entry in the folder list.
7. Click the ``Finish`` button, wait until the importing has completed, and switch to the Eclipse workbench.
8. Wait for any possibly running background tasks, e.g., ``Workspace Build``, to finish.
9. In the Package Explorer, right click on the project ``de.fhdo.ddmm.servicedsl`` and choose the menu entry ``Run As > Eclipse Application`` from the context menu. If a new popup dialog with several "Launch Configurations" appears, hit ``OK``. A new Eclipse runtime environment is started.
10. In the started Eclipse runtime environment, choose the menu entry ``File > Open Projects from File System...``.
11. In the popup dialog, select the folder of the cloned repository as ``Import Source`` and deselect all entries in the folder list, except the one for the ``case-study-example``.
12. Click the ``Finish`` button and wait until the importing has completed.

The case study models are now available in the Project Explorer of the Eclipse runtime environment under the project "case-study-example". The folders "domain", "microservices", "operation", and "technology" contain the complete models of the case study as described in the paper.
