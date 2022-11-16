// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.slb.DomainExtensionArgs;
import com.pulumi.alicloud.slb.inputs.DomainExtensionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * HTTPS listeners of guaranteed-performance SLB support configuring multiple certificates, allowing you to forward requests with different domain names to different backend servers.
 * Please refer to the [documentation](https://www.alibabacloud.com/help/doc-detail/85956.htm?spm=a2c63.p38356.b99.40.1c881563Co8p6w) for details.
 * 
 * &gt; **NOTE:** Available in 1.60.0+
 * 
 * &gt; **NOTE:** The instance with shared loadBalancerSpec doesn&#39;t support domainExtension.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancer;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancerArgs;
 * import com.pulumi.alicloud.slb.ServerCertificate;
 * import com.pulumi.alicloud.slb.ServerCertificateArgs;
 * import com.pulumi.alicloud.slb.Listener;
 * import com.pulumi.alicloud.slb.ListenerArgs;
 * import com.pulumi.alicloud.slb.DomainExtension;
 * import com.pulumi.alicloud.slb.DomainExtensionArgs;
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
 *         var instance = new ApplicationLoadBalancer(&#34;instance&#34;, ApplicationLoadBalancerArgs.builder()        
 *             .loadBalancerName(&#34;tffTestDomainExtension&#34;)
 *             .internetChargeType(&#34;PayByTraffic&#34;)
 *             .internet(&#34;true&#34;)
 *             .build());
 * 
 *         var foo = new ServerCertificate(&#34;foo&#34;, ServerCertificateArgs.builder()        
 *             .serverCertificate(&#34;&#34;&#34;
 * -----BEGIN CERTIFICATE-----
 * MIIDdjCCAl4CCQCcm+erkcKN7DANBgkqhkiG9w0BAQsFADB9MQswCQYDVQQGEwJj
 * bjELMAkGA1UECAwCYmoxEDAOBgNVBAcMB2JlaWppbmcxDzANBgNVBAoMBmFsaXl1
 * bjELMAkGA1UECwwCc2MxFTATBgNVBAMMDHd3dy50ZXN0LmNvbTEaMBgGCSqGSIb3
 * DQEJARYLMTIzQDEyMy5jb20wHhcNMTkwNDI2MDM0ODAxWhcNMjQwNDI1MDM0ODAx
 * WjB9MQswCQYDVQQGEwJjbjELMAkGA1UECAwCYmoxEDAOBgNVBAcMB2JlaWppbmcx
 * DzANBgNVBAoMBmFsaXl1bjELMAkGA1UECwwCc2MxFTATBgNVBAMMDHd3dy50ZXN0
 * LmNvbTEaMBgGCSqGSIb3DQEJARYLMTIzQDEyMy5jb20wggEiMA0GCSqGSIb3DQEB
 * AQUAA4IBDwAwggEKAoIBAQDKMKF5qmN/uoMjdH3D8aPRcUOA0s8rZpYhG8zbkF1j
 * 8gHYoB/FDvM7G7dfVsyjbMwLOxKvAhWvHHSpEz/t7gB+QdwrAMiMJwGmtCnXrh2E
 * WiXgalMe1y4a/T5R7q+m4T1zFATf+kbnHWfkSGF4W7b6UBoaH+9StQ95CnqzNf/2
 * p/Of7+S0XzCxFXw8GIVzZk0xFe6lHJzaq06f3mvzrD+4rpO56tTUvrgTY/n61gsF
 * ZP7f0CJ2JQh6eNRFOEUSfxKu/Dy/+IsQxorCJY2Q59ZAf3rXrqDN104jw9PlwnLl
 * qfZz3RMODN6BWjxE8rvRtT0qMfuAfv1gjBdWZN0hUYBRAgMBAAEwDQYJKoZIhvcN
 * AQELBQADggEBAABzo82TxGp5poVkd5pLWj5ACgcBv8Cs6oH9D+4Jz9BmyuBUsQXh
 * 2aG0hQAe1mU61C9konsl/GTW8umJQ4M4lYEztXXwMf5PlBMGwebM0ZbSGg6jKtZg
 * WCgJ3eP/FMmyXGL5Jji5+e09eObhUDVle4tdi0On97zBoz85W02rgWFAqZJwiEAP
 * t+c7jX7uOSBq2/38iGStlrX5yB1at/gJXXiA5CL5OtlR3Okvb0/QH37efO1Nu39m
 * lFi0ODPAVyXjVypAiLguDxPn6AtDTdk9Iw9B19OD4NrzNRWgSSX5vuxo/VcRcgWk
 * 3gEe9Ca0ZKN20q9XgthAiFFjl1S9ZgdA6Zc=
 * -----END CERTIFICATE-----            &#34;&#34;&#34;)
 *             .privateKey(&#34;&#34;&#34;
 * -----BEGIN RSA PRIVATE KEY-----
 * MIIEowIBAAKCAQEAyjCheapjf7qDI3R9w/Gj0XFDgNLPK2aWIRvM25BdY/IB2KAf
 * xQ7zOxu3X1bMo2zMCzsSrwIVrxx0qRM/7e4AfkHcKwDIjCcBprQp164dhFol4GpT
 * HtcuGv0+Ue6vpuE9cxQE3/pG5x1n5EhheFu2+lAaGh/vUrUPeQp6szX/9qfzn+/k
 * tF8wsRV8PBiFc2ZNMRXupRyc2qtOn95r86w/uK6TuerU1L64E2P5+tYLBWT+39Ai
 * diUIenjURThFEn8Srvw8v/iLEMaKwiWNkOfWQH96166gzddOI8PT5cJy5an2c90T
 * DgzegVo8RPK70bU9KjH7gH79YIwXVmTdIVGAUQIDAQABAoIBAE1J4a/8biR5S3/W
 * G+03BYQeY8tuyjqw8FqfoeOcf9agwAvqybouSNQjeCk9qOQfxq/UWQQFK/zQR9gJ
 * v7pX7GBXFK5rkj3g+0SaQhRsPmRFgY0Tl8qGPt2aSKRRNVv5ZeADmwlzRn86QmiF
 * Mp0rkfqFfDTYWEepZszCML0ouzuxsW/9tq7rvtSjsgATNt31B3vFa3D3JBi31jUh
 * 5nfR9A3bATze7mQw3byEDiVl5ASRDgYyur403P1fDnMy9DBHZ8NaPOsFF6OBpJal
 * BJsG5z00hll5PFN2jfmBQKlvAeU7wfwqdaSnGHOfqf2DeTTaFjIQ4gUhRn/m6pLo
 * 6kXttLECgYEA9sng0Qz/TcPFfM4tQ1gyvB1cKnnGIwg1FP8sfUjbbEgjaHhA224S
 * k3BxtX2Kq6fhTXuwusAFc6OVMAZ76FgrQ5K4Ci7+DTsrF28z4b8td+p+lO/DxgP9
 * lTgN+ddsiTOV4fUef9Z3yY0Zr0CnBUMbQYRaV2UIbCdiB0G4V/bt9TsCgYEA0bya
 * Oo9wGI0RJV0bYP7qwO74Ra1/i1viWbRlS7jU37Q+AZstrlKcQ5CTPzOjKFKMiUzl
 * 4miWacZ0/q2n+Mvd7NbXGXTLijahnyOYKaHJYyh4oBymfkgAifRstE0Ki9gdvArb
 * /I+emC0GvLSyfGN8UUeDJs4NmqdEXGqjo2JOV+MCgYALFv1MR5o9Y1u/hQBRs2fs
 * PiGDIx+9OUQxYloccyaxEfjNXAIGGkcpavchIbgWiJ++PJ2vdquIC8TLeK8evL+M
 * 9M3iX0Q5UfxYvD2HmnCvn9D6Xl/cyRcfGnq+TGjrLW9BzSMGuZt+aiHKV0xqFx7l
 * bc4leTvMqGRmURS4lzcQOwKBgQCDzA/i4sYfN25h21tcHXSpnsG3D2rJyQi5NCo/
 * ZjunA92/JqOTGuiFcLGHEszhhtY3ZXJET1LNz18vtzKJnpqrvOnYXlOVW/U+SqDQ
 * 8JDb1c/PVZGuY1KrXkR9HLiW3kz5IJ3S3PFdUVYdeTN8BQxXCyg4V12nJJtJs912
 * y0zN3wKBgGDS6YttCN6aI4EOABYE8fI1EYQ7vhfiYsaWGWSR1l6bQey7KR6M1ACz
 * ZzMASNyytVt12yXE4/Emv6/pYqigbDLfL1zQJSLJ3EHJYTh2RxjR+AaGDudYFG/T
 * liQ9YXhV5Iu2x1pNwrtFnssDdaaGpfA7l3xC00BL7Z+SAJyI4QKA
 * -----END RSA PRIVATE KEY-----            &#34;&#34;&#34;)
 *             .build());
 * 
 *         var https = new Listener(&#34;https&#34;, ListenerArgs.builder()        
 *             .loadBalancerId(instance.id())
 *             .backendPort(80)
 *             .frontendPort(443)
 *             .protocol(&#34;https&#34;)
 *             .stickySession(&#34;on&#34;)
 *             .stickySessionType(&#34;insert&#34;)
 *             .cookie(&#34;testslblistenercookie&#34;)
 *             .cookieTimeout(86400)
 *             .healthCheck(&#34;on&#34;)
 *             .healthCheckUri(&#34;/cons&#34;)
 *             .healthCheckConnectPort(20)
 *             .healthyThreshold(8)
 *             .unhealthyThreshold(8)
 *             .healthCheckTimeout(8)
 *             .healthCheckInterval(5)
 *             .healthCheckHttpCode(&#34;http_2xx,http_3xx&#34;)
 *             .bandwidth(10)
 *             .sslCertificateId(foo.id())
 *             .build());
 * 
 *         var example1 = new DomainExtension(&#34;example1&#34;, DomainExtensionArgs.builder()        
 *             .loadBalancerId(instance.id())
 *             .frontendPort(https.frontendPort())
 *             .domain(&#34;www.test.com&#34;)
 *             .serverCertificateId(foo.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Load balancer domain_extension can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:slb/domainExtension:DomainExtension example de-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:slb/domainExtension:DomainExtension")
public class DomainExtension extends com.pulumi.resources.CustomResource {
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     * 
     */
    @Export(name="deleteProtectionValidation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteProtectionValidation;

    /**
     * @return Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     * 
     */
    public Output<Optional<Boolean>> deleteProtectionValidation() {
        return Codegen.optional(this.deleteProtectionValidation);
    }
    /**
     * The domain name.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain name.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
     * 
     */
    @Export(name="frontendPort", type=Integer.class, parameters={})
    private Output<Integer> frontendPort;

    /**
     * @return The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
     * 
     */
    public Output<Integer> frontendPort() {
        return this.frontendPort;
    }
    /**
     * The ID of the SLB instance.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The ID of the SLB instance.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * The ID of the certificate used by the domain name.
     * 
     */
    @Export(name="serverCertificateId", type=String.class, parameters={})
    private Output<String> serverCertificateId;

    /**
     * @return The ID of the certificate used by the domain name.
     * 
     */
    public Output<String> serverCertificateId() {
        return this.serverCertificateId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainExtension(String name) {
        this(name, DomainExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainExtension(String name, DomainExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainExtension(String name, DomainExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:slb/domainExtension:DomainExtension", name, args == null ? DomainExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainExtension(String name, Output<String> id, @Nullable DomainExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:slb/domainExtension:DomainExtension", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DomainExtension get(String name, Output<String> id, @Nullable DomainExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainExtension(name, id, state, options);
    }
}