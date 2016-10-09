#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.sling.models.annotations.Model;

#parse("File Header.java")
@Model(adaptables = {})
public class ${NAME} {
}