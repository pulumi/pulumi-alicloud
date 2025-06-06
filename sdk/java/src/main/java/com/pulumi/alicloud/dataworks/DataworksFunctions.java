// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dataworks.inputs.GetFoldersArgs;
import com.pulumi.alicloud.dataworks.inputs.GetFoldersPlainArgs;
import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
import com.pulumi.alicloud.dataworks.inputs.GetServicePlainArgs;
import com.pulumi.alicloud.dataworks.outputs.GetFoldersResult;
import com.pulumi.alicloud.dataworks.outputs.GetServiceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class DataworksFunctions {
    /**
     * This data source provides the Data Works Folders of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.Folder;
     * import com.pulumi.alicloud.dataworks.FolderArgs;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetFoldersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var default_ = new Folder("default", FolderArgs.builder()
     *             .projectId("xxxx")
     *             .folderPath("Business Flow/tfTestAcc/folderDi")
     *             .build());
     * 
     *         final var ids = Output.tuple(default_.folderId(), default_.projectId()).applyValue(values -> {
     *             var folderId = values.t1;
     *             var projectId = values.t2;
     *             return DataworksFunctions.getFolders(GetFoldersArgs.builder()
     *                 .ids(folderId)
     *                 .projectId(projectId)
     *                 .parentFolderPath("Business Flow/tfTestAcc/folderDi")
     *                 .build());
     *         });
     * 
     *         ctx.export("dataWorksFolderId1", ids.applyValue(_ids -> _ids.folders()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetFoldersResult> getFolders(GetFoldersArgs args) {
        return getFolders(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Data Works Folders of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.Folder;
     * import com.pulumi.alicloud.dataworks.FolderArgs;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetFoldersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var default_ = new Folder("default", FolderArgs.builder()
     *             .projectId("xxxx")
     *             .folderPath("Business Flow/tfTestAcc/folderDi")
     *             .build());
     * 
     *         final var ids = Output.tuple(default_.folderId(), default_.projectId()).applyValue(values -> {
     *             var folderId = values.t1;
     *             var projectId = values.t2;
     *             return DataworksFunctions.getFolders(GetFoldersArgs.builder()
     *                 .ids(folderId)
     *                 .projectId(projectId)
     *                 .parentFolderPath("Business Flow/tfTestAcc/folderDi")
     *                 .build());
     *         });
     * 
     *         ctx.export("dataWorksFolderId1", ids.applyValue(_ids -> _ids.folders()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetFoldersResult> getFoldersPlain(GetFoldersPlainArgs args) {
        return getFoldersPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Data Works Folders of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.Folder;
     * import com.pulumi.alicloud.dataworks.FolderArgs;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetFoldersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var default_ = new Folder("default", FolderArgs.builder()
     *             .projectId("xxxx")
     *             .folderPath("Business Flow/tfTestAcc/folderDi")
     *             .build());
     * 
     *         final var ids = Output.tuple(default_.folderId(), default_.projectId()).applyValue(values -> {
     *             var folderId = values.t1;
     *             var projectId = values.t2;
     *             return DataworksFunctions.getFolders(GetFoldersArgs.builder()
     *                 .ids(folderId)
     *                 .projectId(projectId)
     *                 .parentFolderPath("Business Flow/tfTestAcc/folderDi")
     *                 .build());
     *         });
     * 
     *         ctx.export("dataWorksFolderId1", ids.applyValue(_ids -> _ids.folders()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetFoldersResult> getFolders(GetFoldersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:dataworks/getFolders:getFolders", TypeShape.of(GetFoldersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Data Works Folders of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.Folder;
     * import com.pulumi.alicloud.dataworks.FolderArgs;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetFoldersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var default_ = new Folder("default", FolderArgs.builder()
     *             .projectId("xxxx")
     *             .folderPath("Business Flow/tfTestAcc/folderDi")
     *             .build());
     * 
     *         final var ids = Output.tuple(default_.folderId(), default_.projectId()).applyValue(values -> {
     *             var folderId = values.t1;
     *             var projectId = values.t2;
     *             return DataworksFunctions.getFolders(GetFoldersArgs.builder()
     *                 .ids(folderId)
     *                 .projectId(projectId)
     *                 .parentFolderPath("Business Flow/tfTestAcc/folderDi")
     *                 .build());
     *         });
     * 
     *         ctx.export("dataWorksFolderId1", ids.applyValue(_ids -> _ids.folders()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetFoldersResult> getFolders(GetFoldersArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:dataworks/getFolders:getFolders", TypeShape.of(GetFoldersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Data Works Folders of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.Folder;
     * import com.pulumi.alicloud.dataworks.FolderArgs;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetFoldersArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var default_ = new Folder("default", FolderArgs.builder()
     *             .projectId("xxxx")
     *             .folderPath("Business Flow/tfTestAcc/folderDi")
     *             .build());
     * 
     *         final var ids = Output.tuple(default_.folderId(), default_.projectId()).applyValue(values -> {
     *             var folderId = values.t1;
     *             var projectId = values.t2;
     *             return DataworksFunctions.getFolders(GetFoldersArgs.builder()
     *                 .ids(folderId)
     *                 .projectId(projectId)
     *                 .parentFolderPath("Business Flow/tfTestAcc/folderDi")
     *                 .build());
     *         });
     * 
     *         ctx.export("dataWorksFolderId1", ids.applyValue(_ids -> _ids.folders()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetFoldersResult> getFoldersPlain(GetFoldersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:dataworks/getFolders:getFolders", TypeShape.of(GetFoldersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open DataWorks service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DataWorks and how to use it, see [What is DataWorks](https://www.alibabacloud.com/help/en/product/72772.htm).
     * 
     * &gt; **NOTE:** Available in v1.118.0+. After the version 1.141.0, the data source is renamed as `alicloud.dataworks.getService`.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var open = DataworksFunctions.getService(GetServiceArgs.builder()
     *             .enable("On")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServiceResult> getService() {
        return getService(GetServiceArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DataWorks service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DataWorks and how to use it, see [What is DataWorks](https://www.alibabacloud.com/help/en/product/72772.htm).
     * 
     * &gt; **NOTE:** Available in v1.118.0+. After the version 1.141.0, the data source is renamed as `alicloud.dataworks.getService`.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var open = DataworksFunctions.getService(GetServiceArgs.builder()
     *             .enable("On")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain() {
        return getServicePlain(GetServicePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DataWorks service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DataWorks and how to use it, see [What is DataWorks](https://www.alibabacloud.com/help/en/product/72772.htm).
     * 
     * &gt; **NOTE:** Available in v1.118.0+. After the version 1.141.0, the data source is renamed as `alicloud.dataworks.getService`.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var open = DataworksFunctions.getService(GetServiceArgs.builder()
     *             .enable("On")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DataWorks service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DataWorks and how to use it, see [What is DataWorks](https://www.alibabacloud.com/help/en/product/72772.htm).
     * 
     * &gt; **NOTE:** Available in v1.118.0+. After the version 1.141.0, the data source is renamed as `alicloud.dataworks.getService`.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var open = DataworksFunctions.getService(GetServiceArgs.builder()
     *             .enable("On")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DataWorks service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DataWorks and how to use it, see [What is DataWorks](https://www.alibabacloud.com/help/en/product/72772.htm).
     * 
     * &gt; **NOTE:** Available in v1.118.0+. After the version 1.141.0, the data source is renamed as `alicloud.dataworks.getService`.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var open = DataworksFunctions.getService(GetServiceArgs.builder()
     *             .enable("On")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:dataworks/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open DataWorks service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DataWorks and how to use it, see [What is DataWorks](https://www.alibabacloud.com/help/en/product/72772.htm).
     * 
     * &gt; **NOTE:** Available in v1.118.0+. After the version 1.141.0, the data source is renamed as `alicloud.dataworks.getService`.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var open = DataworksFunctions.getService(GetServiceArgs.builder()
     *             .enable("On")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:dataworks/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open DataWorks service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DataWorks and how to use it, see [What is DataWorks](https://www.alibabacloud.com/help/en/product/72772.htm).
     * 
     * &gt; **NOTE:** Available in v1.118.0+. After the version 1.141.0, the data source is renamed as `alicloud.dataworks.getService`.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dataworks.DataworksFunctions;
     * import com.pulumi.alicloud.dataworks.inputs.GetServiceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var open = DataworksFunctions.getService(GetServiceArgs.builder()
     *             .enable("On")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:dataworks/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
}
