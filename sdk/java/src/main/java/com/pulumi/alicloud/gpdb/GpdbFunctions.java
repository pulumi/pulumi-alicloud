// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gpdb.inputs.GetAccountsArgs;
import com.pulumi.alicloud.gpdb.inputs.GetAccountsPlainArgs;
import com.pulumi.alicloud.gpdb.inputs.GetInstancesArgs;
import com.pulumi.alicloud.gpdb.inputs.GetInstancesPlainArgs;
import com.pulumi.alicloud.gpdb.inputs.GetZonesArgs;
import com.pulumi.alicloud.gpdb.inputs.GetZonesPlainArgs;
import com.pulumi.alicloud.gpdb.outputs.GetAccountsResult;
import com.pulumi.alicloud.gpdb.outputs.GetInstancesResult;
import com.pulumi.alicloud.gpdb.outputs.GetZonesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class GpdbFunctions {
    /**
     * This data source provides the Gpdb Accounts of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.142.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.clickhouse.inputs.GetAccountsArgs;
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
     *         final var ids = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;my-Account-1&#34;,
     *                 &#34;my-Account-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId1&#34;, ids.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *         final var nameRegex = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .nameRegex(&#34;^my-Account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId2&#34;, nameRegex.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountsResult> getAccounts(GetAccountsArgs args) {
        return getAccounts(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Gpdb Accounts of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.142.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.clickhouse.inputs.GetAccountsArgs;
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
     *         final var ids = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;my-Account-1&#34;,
     *                 &#34;my-Account-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId1&#34;, ids.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *         final var nameRegex = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .nameRegex(&#34;^my-Account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId2&#34;, nameRegex.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountsResult> getAccountsPlain(GetAccountsPlainArgs args) {
        return getAccountsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Gpdb Accounts of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.142.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.clickhouse.inputs.GetAccountsArgs;
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
     *         final var ids = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;my-Account-1&#34;,
     *                 &#34;my-Account-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId1&#34;, ids.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *         final var nameRegex = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .nameRegex(&#34;^my-Account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId2&#34;, nameRegex.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountsResult> getAccounts(GetAccountsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:gpdb/getAccounts:getAccounts", TypeShape.of(GetAccountsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Gpdb Accounts of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.142.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.clickhouse.inputs.GetAccountsArgs;
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
     *         final var ids = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;my-Account-1&#34;,
     *                 &#34;my-Account-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId1&#34;, ids.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *         final var nameRegex = GpdbFunctions.getAccounts(GetAccountsArgs.builder()
     *             .dbInstanceId(&#34;example_value&#34;)
     *             .nameRegex(&#34;^my-Account&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;gpdbAccountId2&#34;, nameRegex.applyValue(getAccountsResult -&gt; getAccountsResult.accounts()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountsResult> getAccountsPlain(GetAccountsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:gpdb/getAccounts:getAccounts", TypeShape.of(GetAccountsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The `alicloud.gpdb.getInstances` data source provides a collection of AnalyticDB for PostgreSQL instances available in Alicloud account.
     * Filters support regular expression for the instance name or availability_zone.
     * 
     * &gt; **NOTE:**  Available in 1.47.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
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
     *         final var gpdb = GpdbFunctions.getInstances(GetInstancesArgs.builder()
     *             .availabilityZone(&#34;cn-beijing-c&#34;)
     *             .nameRegex(&#34;gp-.+\\d+&#34;)
     *             .outputFile(&#34;instances.txt&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceId&#34;, gpdb.applyValue(getInstancesResult -&gt; getInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetInstancesResult> getInstances() {
        return getInstances(GetInstancesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The `alicloud.gpdb.getInstances` data source provides a collection of AnalyticDB for PostgreSQL instances available in Alicloud account.
     * Filters support regular expression for the instance name or availability_zone.
     * 
     * &gt; **NOTE:**  Available in 1.47.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
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
     *         final var gpdb = GpdbFunctions.getInstances(GetInstancesArgs.builder()
     *             .availabilityZone(&#34;cn-beijing-c&#34;)
     *             .nameRegex(&#34;gp-.+\\d+&#34;)
     *             .outputFile(&#34;instances.txt&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceId&#34;, gpdb.applyValue(getInstancesResult -&gt; getInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstancesPlain() {
        return getInstancesPlain(GetInstancesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The `alicloud.gpdb.getInstances` data source provides a collection of AnalyticDB for PostgreSQL instances available in Alicloud account.
     * Filters support regular expression for the instance name or availability_zone.
     * 
     * &gt; **NOTE:**  Available in 1.47.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
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
     *         final var gpdb = GpdbFunctions.getInstances(GetInstancesArgs.builder()
     *             .availabilityZone(&#34;cn-beijing-c&#34;)
     *             .nameRegex(&#34;gp-.+\\d+&#34;)
     *             .outputFile(&#34;instances.txt&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceId&#34;, gpdb.applyValue(getInstancesResult -&gt; getInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetInstancesResult> getInstances(GetInstancesArgs args) {
        return getInstances(args, InvokeOptions.Empty);
    }
    /**
     * The `alicloud.gpdb.getInstances` data source provides a collection of AnalyticDB for PostgreSQL instances available in Alicloud account.
     * Filters support regular expression for the instance name or availability_zone.
     * 
     * &gt; **NOTE:**  Available in 1.47.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
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
     *         final var gpdb = GpdbFunctions.getInstances(GetInstancesArgs.builder()
     *             .availabilityZone(&#34;cn-beijing-c&#34;)
     *             .nameRegex(&#34;gp-.+\\d+&#34;)
     *             .outputFile(&#34;instances.txt&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceId&#34;, gpdb.applyValue(getInstancesResult -&gt; getInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstancesPlain(GetInstancesPlainArgs args) {
        return getInstancesPlain(args, InvokeOptions.Empty);
    }
    /**
     * The `alicloud.gpdb.getInstances` data source provides a collection of AnalyticDB for PostgreSQL instances available in Alicloud account.
     * Filters support regular expression for the instance name or availability_zone.
     * 
     * &gt; **NOTE:**  Available in 1.47.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
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
     *         final var gpdb = GpdbFunctions.getInstances(GetInstancesArgs.builder()
     *             .availabilityZone(&#34;cn-beijing-c&#34;)
     *             .nameRegex(&#34;gp-.+\\d+&#34;)
     *             .outputFile(&#34;instances.txt&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceId&#34;, gpdb.applyValue(getInstancesResult -&gt; getInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetInstancesResult> getInstances(GetInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:gpdb/getInstances:getInstances", TypeShape.of(GetInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The `alicloud.gpdb.getInstances` data source provides a collection of AnalyticDB for PostgreSQL instances available in Alicloud account.
     * Filters support regular expression for the instance name or availability_zone.
     * 
     * &gt; **NOTE:**  Available in 1.47.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
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
     *         final var gpdb = GpdbFunctions.getInstances(GetInstancesArgs.builder()
     *             .availabilityZone(&#34;cn-beijing-c&#34;)
     *             .nameRegex(&#34;gp-.+\\d+&#34;)
     *             .outputFile(&#34;instances.txt&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceId&#34;, gpdb.applyValue(getInstancesResult -&gt; getInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstancesPlain(GetInstancesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:gpdb/getInstances:getInstances", TypeShape.of(GetInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides availability zones for Gpdb that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
     * import com.pulumi.alicloud.hbase.Instance;
     * import com.pulumi.alicloud.hbase.InstanceArgs;
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
     *         final var zonesIds = GpdbFunctions.getZones();
     * 
     *         var hbase = new Instance(&#34;hbase&#34;, InstanceArgs.builder()        
     *             .availabilityZone(zonesIds.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetZonesResult> getZones() {
        return getZones(GetZonesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for Gpdb that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
     * import com.pulumi.alicloud.hbase.Instance;
     * import com.pulumi.alicloud.hbase.InstanceArgs;
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
     *         final var zonesIds = GpdbFunctions.getZones();
     * 
     *         var hbase = new Instance(&#34;hbase&#34;, InstanceArgs.builder()        
     *             .availabilityZone(zonesIds.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain() {
        return getZonesPlain(GetZonesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for Gpdb that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
     * import com.pulumi.alicloud.hbase.Instance;
     * import com.pulumi.alicloud.hbase.InstanceArgs;
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
     *         final var zonesIds = GpdbFunctions.getZones();
     * 
     *         var hbase = new Instance(&#34;hbase&#34;, InstanceArgs.builder()        
     *             .availabilityZone(zonesIds.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetZonesResult> getZones(GetZonesArgs args) {
        return getZones(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for Gpdb that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
     * import com.pulumi.alicloud.hbase.Instance;
     * import com.pulumi.alicloud.hbase.InstanceArgs;
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
     *         final var zonesIds = GpdbFunctions.getZones();
     * 
     *         var hbase = new Instance(&#34;hbase&#34;, InstanceArgs.builder()        
     *             .availabilityZone(zonesIds.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain(GetZonesPlainArgs args) {
        return getZonesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for Gpdb that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
     * import com.pulumi.alicloud.hbase.Instance;
     * import com.pulumi.alicloud.hbase.InstanceArgs;
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
     *         final var zonesIds = GpdbFunctions.getZones();
     * 
     *         var hbase = new Instance(&#34;hbase&#34;, InstanceArgs.builder()        
     *             .availabilityZone(zonesIds.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetZonesResult> getZones(GetZonesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:gpdb/getZones:getZones", TypeShape.of(GetZonesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides availability zones for Gpdb that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gpdb.GpdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
     * import com.pulumi.alicloud.hbase.Instance;
     * import com.pulumi.alicloud.hbase.InstanceArgs;
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
     *         final var zonesIds = GpdbFunctions.getZones();
     * 
     *         var hbase = new Instance(&#34;hbase&#34;, InstanceArgs.builder()        
     *             .availabilityZone(zonesIds.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain(GetZonesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:gpdb/getZones:getZones", TypeShape.of(GetZonesResult.class), args, Utilities.withVersion(options));
    }
}