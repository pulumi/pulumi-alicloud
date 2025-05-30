// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.iot;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsPlainArgs;
import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
import com.pulumi.alicloud.iot.inputs.GetServicePlainArgs;
import com.pulumi.alicloud.iot.outputs.GetDeviceGroupsResult;
import com.pulumi.alicloud.iot.outputs.GetServiceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class IotFunctions {
    /**
     * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.134.0+.
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
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
     *         final var ids = IotFunctions.getDeviceGroups(GetDeviceGroupsArgs.builder()
     *             .build());
     * 
     *         ctx.export("iotDeviceGroupId1", ids.groups()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDeviceGroupsResult> getDeviceGroups() {
        return getDeviceGroups(GetDeviceGroupsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.134.0+.
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
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
     *         final var ids = IotFunctions.getDeviceGroups(GetDeviceGroupsArgs.builder()
     *             .build());
     * 
     *         ctx.export("iotDeviceGroupId1", ids.groups()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDeviceGroupsResult> getDeviceGroupsPlain() {
        return getDeviceGroupsPlain(GetDeviceGroupsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.134.0+.
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
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
     *         final var ids = IotFunctions.getDeviceGroups(GetDeviceGroupsArgs.builder()
     *             .build());
     * 
     *         ctx.export("iotDeviceGroupId1", ids.groups()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDeviceGroupsResult> getDeviceGroups(GetDeviceGroupsArgs args) {
        return getDeviceGroups(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.134.0+.
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
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
     *         final var ids = IotFunctions.getDeviceGroups(GetDeviceGroupsArgs.builder()
     *             .build());
     * 
     *         ctx.export("iotDeviceGroupId1", ids.groups()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDeviceGroupsResult> getDeviceGroupsPlain(GetDeviceGroupsPlainArgs args) {
        return getDeviceGroupsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.134.0+.
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
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
     *         final var ids = IotFunctions.getDeviceGroups(GetDeviceGroupsArgs.builder()
     *             .build());
     * 
     *         ctx.export("iotDeviceGroupId1", ids.groups()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDeviceGroupsResult> getDeviceGroups(GetDeviceGroupsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:iot/getDeviceGroups:getDeviceGroups", TypeShape.of(GetDeviceGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.134.0+.
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
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
     *         final var ids = IotFunctions.getDeviceGroups(GetDeviceGroupsArgs.builder()
     *             .build());
     * 
     *         ctx.export("iotDeviceGroupId1", ids.groups()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDeviceGroupsResult> getDeviceGroups(GetDeviceGroupsArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:iot/getDeviceGroups:getDeviceGroups", TypeShape.of(GetDeviceGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.134.0+.
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetDeviceGroupsArgs;
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
     *         final var ids = IotFunctions.getDeviceGroups(GetDeviceGroupsArgs.builder()
     *             .build());
     * 
     *         ctx.export("iotDeviceGroupId1", ids.groups()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDeviceGroupsResult> getDeviceGroupsPlain(GetDeviceGroupsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:iot/getDeviceGroups:getDeviceGroups", TypeShape.of(GetDeviceGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open IOT service automatically. If the service has been opened, it will return opened.
     * 
     * For information about IOT and how to use it, see [What is IOT](https://www.alibabacloud.com/help/en/product/30520.htm).
     * 
     * &gt; **NOTE:** Available in v1.115.0+
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
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
     *         final var open = IotFunctions.getService(GetServiceArgs.builder()
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
     * Using this data source can open IOT service automatically. If the service has been opened, it will return opened.
     * 
     * For information about IOT and how to use it, see [What is IOT](https://www.alibabacloud.com/help/en/product/30520.htm).
     * 
     * &gt; **NOTE:** Available in v1.115.0+
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
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
     *         final var open = IotFunctions.getService(GetServiceArgs.builder()
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
     * Using this data source can open IOT service automatically. If the service has been opened, it will return opened.
     * 
     * For information about IOT and how to use it, see [What is IOT](https://www.alibabacloud.com/help/en/product/30520.htm).
     * 
     * &gt; **NOTE:** Available in v1.115.0+
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
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
     *         final var open = IotFunctions.getService(GetServiceArgs.builder()
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
     * Using this data source can open IOT service automatically. If the service has been opened, it will return opened.
     * 
     * For information about IOT and how to use it, see [What is IOT](https://www.alibabacloud.com/help/en/product/30520.htm).
     * 
     * &gt; **NOTE:** Available in v1.115.0+
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
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
     *         final var open = IotFunctions.getService(GetServiceArgs.builder()
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
     * Using this data source can open IOT service automatically. If the service has been opened, it will return opened.
     * 
     * For information about IOT and how to use it, see [What is IOT](https://www.alibabacloud.com/help/en/product/30520.htm).
     * 
     * &gt; **NOTE:** Available in v1.115.0+
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
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
     *         final var open = IotFunctions.getService(GetServiceArgs.builder()
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
        return Deployment.getInstance().invoke("alicloud:iot/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open IOT service automatically. If the service has been opened, it will return opened.
     * 
     * For information about IOT and how to use it, see [What is IOT](https://www.alibabacloud.com/help/en/product/30520.htm).
     * 
     * &gt; **NOTE:** Available in v1.115.0+
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
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
     *         final var open = IotFunctions.getService(GetServiceArgs.builder()
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
        return Deployment.getInstance().invoke("alicloud:iot/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open IOT service automatically. If the service has been opened, it will return opened.
     * 
     * For information about IOT and how to use it, see [What is IOT](https://www.alibabacloud.com/help/en/product/30520.htm).
     * 
     * &gt; **NOTE:** Available in v1.115.0+
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
     * import com.pulumi.alicloud.iot.IotFunctions;
     * import com.pulumi.alicloud.iot.inputs.GetServiceArgs;
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
     *         final var open = IotFunctions.getService(GetServiceArgs.builder()
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
        return Deployment.getInstance().invokeAsync("alicloud:iot/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
}
