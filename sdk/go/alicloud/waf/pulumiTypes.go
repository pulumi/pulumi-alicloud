// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type DomainLogHeader struct {
	Key   *string `pulumi:"key"`
	Value *string `pulumi:"value"`
}

// DomainLogHeaderInput is an input type that accepts DomainLogHeaderArgs and DomainLogHeaderOutput values.
// You can construct a concrete instance of `DomainLogHeaderInput` via:
//
//	DomainLogHeaderArgs{...}
type DomainLogHeaderInput interface {
	pulumi.Input

	ToDomainLogHeaderOutput() DomainLogHeaderOutput
	ToDomainLogHeaderOutputWithContext(context.Context) DomainLogHeaderOutput
}

type DomainLogHeaderArgs struct {
	Key   pulumi.StringPtrInput `pulumi:"key"`
	Value pulumi.StringPtrInput `pulumi:"value"`
}

func (DomainLogHeaderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainLogHeader)(nil)).Elem()
}

func (i DomainLogHeaderArgs) ToDomainLogHeaderOutput() DomainLogHeaderOutput {
	return i.ToDomainLogHeaderOutputWithContext(context.Background())
}

func (i DomainLogHeaderArgs) ToDomainLogHeaderOutputWithContext(ctx context.Context) DomainLogHeaderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainLogHeaderOutput)
}

// DomainLogHeaderArrayInput is an input type that accepts DomainLogHeaderArray and DomainLogHeaderArrayOutput values.
// You can construct a concrete instance of `DomainLogHeaderArrayInput` via:
//
//	DomainLogHeaderArray{ DomainLogHeaderArgs{...} }
type DomainLogHeaderArrayInput interface {
	pulumi.Input

	ToDomainLogHeaderArrayOutput() DomainLogHeaderArrayOutput
	ToDomainLogHeaderArrayOutputWithContext(context.Context) DomainLogHeaderArrayOutput
}

type DomainLogHeaderArray []DomainLogHeaderInput

func (DomainLogHeaderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DomainLogHeader)(nil)).Elem()
}

func (i DomainLogHeaderArray) ToDomainLogHeaderArrayOutput() DomainLogHeaderArrayOutput {
	return i.ToDomainLogHeaderArrayOutputWithContext(context.Background())
}

func (i DomainLogHeaderArray) ToDomainLogHeaderArrayOutputWithContext(ctx context.Context) DomainLogHeaderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainLogHeaderArrayOutput)
}

type DomainLogHeaderOutput struct{ *pulumi.OutputState }

func (DomainLogHeaderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainLogHeader)(nil)).Elem()
}

func (o DomainLogHeaderOutput) ToDomainLogHeaderOutput() DomainLogHeaderOutput {
	return o
}

func (o DomainLogHeaderOutput) ToDomainLogHeaderOutputWithContext(ctx context.Context) DomainLogHeaderOutput {
	return o
}

func (o DomainLogHeaderOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DomainLogHeader) *string { return v.Key }).(pulumi.StringPtrOutput)
}

func (o DomainLogHeaderOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DomainLogHeader) *string { return v.Value }).(pulumi.StringPtrOutput)
}

type DomainLogHeaderArrayOutput struct{ *pulumi.OutputState }

func (DomainLogHeaderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DomainLogHeader)(nil)).Elem()
}

func (o DomainLogHeaderArrayOutput) ToDomainLogHeaderArrayOutput() DomainLogHeaderArrayOutput {
	return o
}

func (o DomainLogHeaderArrayOutput) ToDomainLogHeaderArrayOutputWithContext(ctx context.Context) DomainLogHeaderArrayOutput {
	return o
}

func (o DomainLogHeaderArrayOutput) Index(i pulumi.IntInput) DomainLogHeaderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DomainLogHeader {
		return vs[0].([]DomainLogHeader)[vs[1].(int)]
	}).(DomainLogHeaderOutput)
}

type GetCertificatesCertificate struct {
	// Certificate recording ID.
	CertificateId string `pulumi:"certificateId"`
	// Your certificate name.
	CertificateName string `pulumi:"certificateName"`
	// Certificate bound to the domain name.
	CommonName string `pulumi:"commonName"`
	// WAF domain name.
	Domain string `pulumi:"domain"`
	// The ID of the Certificate.
	Id string `pulumi:"id"`
	// WAF instance ID.
	InstanceId string   `pulumi:"instanceId"`
	IsUsing    bool     `pulumi:"isUsing"`
	Sans       []string `pulumi:"sans"`
}

// GetCertificatesCertificateInput is an input type that accepts GetCertificatesCertificateArgs and GetCertificatesCertificateOutput values.
// You can construct a concrete instance of `GetCertificatesCertificateInput` via:
//
//	GetCertificatesCertificateArgs{...}
type GetCertificatesCertificateInput interface {
	pulumi.Input

	ToGetCertificatesCertificateOutput() GetCertificatesCertificateOutput
	ToGetCertificatesCertificateOutputWithContext(context.Context) GetCertificatesCertificateOutput
}

type GetCertificatesCertificateArgs struct {
	// Certificate recording ID.
	CertificateId pulumi.StringInput `pulumi:"certificateId"`
	// Your certificate name.
	CertificateName pulumi.StringInput `pulumi:"certificateName"`
	// Certificate bound to the domain name.
	CommonName pulumi.StringInput `pulumi:"commonName"`
	// WAF domain name.
	Domain pulumi.StringInput `pulumi:"domain"`
	// The ID of the Certificate.
	Id pulumi.StringInput `pulumi:"id"`
	// WAF instance ID.
	InstanceId pulumi.StringInput      `pulumi:"instanceId"`
	IsUsing    pulumi.BoolInput        `pulumi:"isUsing"`
	Sans       pulumi.StringArrayInput `pulumi:"sans"`
}

func (GetCertificatesCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCertificatesCertificate)(nil)).Elem()
}

func (i GetCertificatesCertificateArgs) ToGetCertificatesCertificateOutput() GetCertificatesCertificateOutput {
	return i.ToGetCertificatesCertificateOutputWithContext(context.Background())
}

func (i GetCertificatesCertificateArgs) ToGetCertificatesCertificateOutputWithContext(ctx context.Context) GetCertificatesCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetCertificatesCertificateOutput)
}

// GetCertificatesCertificateArrayInput is an input type that accepts GetCertificatesCertificateArray and GetCertificatesCertificateArrayOutput values.
// You can construct a concrete instance of `GetCertificatesCertificateArrayInput` via:
//
//	GetCertificatesCertificateArray{ GetCertificatesCertificateArgs{...} }
type GetCertificatesCertificateArrayInput interface {
	pulumi.Input

	ToGetCertificatesCertificateArrayOutput() GetCertificatesCertificateArrayOutput
	ToGetCertificatesCertificateArrayOutputWithContext(context.Context) GetCertificatesCertificateArrayOutput
}

type GetCertificatesCertificateArray []GetCertificatesCertificateInput

func (GetCertificatesCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetCertificatesCertificate)(nil)).Elem()
}

func (i GetCertificatesCertificateArray) ToGetCertificatesCertificateArrayOutput() GetCertificatesCertificateArrayOutput {
	return i.ToGetCertificatesCertificateArrayOutputWithContext(context.Background())
}

func (i GetCertificatesCertificateArray) ToGetCertificatesCertificateArrayOutputWithContext(ctx context.Context) GetCertificatesCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetCertificatesCertificateArrayOutput)
}

type GetCertificatesCertificateOutput struct{ *pulumi.OutputState }

func (GetCertificatesCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCertificatesCertificate)(nil)).Elem()
}

func (o GetCertificatesCertificateOutput) ToGetCertificatesCertificateOutput() GetCertificatesCertificateOutput {
	return o
}

func (o GetCertificatesCertificateOutput) ToGetCertificatesCertificateOutputWithContext(ctx context.Context) GetCertificatesCertificateOutput {
	return o
}

// Certificate recording ID.
func (o GetCertificatesCertificateOutput) CertificateId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) string { return v.CertificateId }).(pulumi.StringOutput)
}

// Your certificate name.
func (o GetCertificatesCertificateOutput) CertificateName() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) string { return v.CertificateName }).(pulumi.StringOutput)
}

// Certificate bound to the domain name.
func (o GetCertificatesCertificateOutput) CommonName() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) string { return v.CommonName }).(pulumi.StringOutput)
}

// WAF domain name.
func (o GetCertificatesCertificateOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) string { return v.Domain }).(pulumi.StringOutput)
}

// The ID of the Certificate.
func (o GetCertificatesCertificateOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) string { return v.Id }).(pulumi.StringOutput)
}

// WAF instance ID.
func (o GetCertificatesCertificateOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetCertificatesCertificateOutput) IsUsing() pulumi.BoolOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) bool { return v.IsUsing }).(pulumi.BoolOutput)
}

func (o GetCertificatesCertificateOutput) Sans() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCertificatesCertificate) []string { return v.Sans }).(pulumi.StringArrayOutput)
}

type GetCertificatesCertificateArrayOutput struct{ *pulumi.OutputState }

func (GetCertificatesCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetCertificatesCertificate)(nil)).Elem()
}

func (o GetCertificatesCertificateArrayOutput) ToGetCertificatesCertificateArrayOutput() GetCertificatesCertificateArrayOutput {
	return o
}

func (o GetCertificatesCertificateArrayOutput) ToGetCertificatesCertificateArrayOutputWithContext(ctx context.Context) GetCertificatesCertificateArrayOutput {
	return o
}

func (o GetCertificatesCertificateArrayOutput) Index(i pulumi.IntInput) GetCertificatesCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetCertificatesCertificate {
		return vs[0].([]GetCertificatesCertificate)[vs[1].(int)]
	}).(GetCertificatesCertificateOutput)
}

type GetDomainsDomain struct {
	// The type of the WAF cluster.
	ClusterType string `pulumi:"clusterType"`
	// The CNAME record assigned by the WAF instance to the specified domain.
	Cname string `pulumi:"cname"`
	// The connection timeout for WAF exclusive clusters. Valid values: `PhysicalCluster` and `VirtualCluster`. Default to `PhysicalCluster`.
	ConnectionTime int `pulumi:"connectionTime"`
	// Field `domain` has been deprecated from version 1.94.0. Use `domainName` instead.
	Domain string `pulumi:"domain"`
	// Name of the domain.
	DomainName string `pulumi:"domainName"`
	// List of the HTTP 2.0 ports.
	Http2Ports []string `pulumi:"http2Ports"`
	// List of the HTTP ports.
	HttpPorts []string `pulumi:"httpPorts"`
	// Specifies whether to enable the HTTP back-to-origin feature. After this feature is enabled, the WAF instance can use HTTP to forward HTTPS requests to the origin server.
	HttpToUserIp string `pulumi:"httpToUserIp"`
	// List of the HTTPS ports.
	HttpsPorts []string `pulumi:"httpsPorts"`
	// Specifies whether to redirect HTTP requests as HTTPS requests. Valid values: `On` and `Off`. Default to `Off`.
	HttpsRedirect string `pulumi:"httpsRedirect"`
	// The ID of domain self ID, value as `domainName`.
	Id string `pulumi:"id"`
	// Specifies whether to configure a Layer-7 proxy, such as Anti-DDoS Pro or CDN, to filter the inbound traffic before it is forwarded to WAF. Valid values: `On` and "Off". Default to `Off`.
	IsAccessProduct string `pulumi:"isAccessProduct"`
	// The load balancing algorithm that is used to forward requests to the origin. Valid values: `IpHash` and `RoundRobin`. Default to `IpHash`.
	LoadBalancing string `pulumi:"loadBalancing"`
	// The key-value pair that is used to mark the traffic that flows through WAF to the domain. Each item contains two field:
	LogHeaders []GetDomainsDomainLogHeader `pulumi:"logHeaders"`
	// The read timeout of a WAF exclusive cluster. Unit: seconds.
	ReadTime int `pulumi:"readTime"`
	// The ID of the resource group to which the queried domain belongs in Resource Management.
	ResourceGroupId string `pulumi:"resourceGroupId"`
	// List of the IP address or domain of the origin server to which the specified domain points.
	SourceIps []string `pulumi:"sourceIps"`
	// The system data identifier that is used to control optimistic locking.
	Version int `pulumi:"version"`
	// The timeout period for a WAF exclusive cluster write connection. Unit: seconds.
	WriteTime int `pulumi:"writeTime"`
}

// GetDomainsDomainInput is an input type that accepts GetDomainsDomainArgs and GetDomainsDomainOutput values.
// You can construct a concrete instance of `GetDomainsDomainInput` via:
//
//	GetDomainsDomainArgs{...}
type GetDomainsDomainInput interface {
	pulumi.Input

	ToGetDomainsDomainOutput() GetDomainsDomainOutput
	ToGetDomainsDomainOutputWithContext(context.Context) GetDomainsDomainOutput
}

type GetDomainsDomainArgs struct {
	// The type of the WAF cluster.
	ClusterType pulumi.StringInput `pulumi:"clusterType"`
	// The CNAME record assigned by the WAF instance to the specified domain.
	Cname pulumi.StringInput `pulumi:"cname"`
	// The connection timeout for WAF exclusive clusters. Valid values: `PhysicalCluster` and `VirtualCluster`. Default to `PhysicalCluster`.
	ConnectionTime pulumi.IntInput `pulumi:"connectionTime"`
	// Field `domain` has been deprecated from version 1.94.0. Use `domainName` instead.
	Domain pulumi.StringInput `pulumi:"domain"`
	// Name of the domain.
	DomainName pulumi.StringInput `pulumi:"domainName"`
	// List of the HTTP 2.0 ports.
	Http2Ports pulumi.StringArrayInput `pulumi:"http2Ports"`
	// List of the HTTP ports.
	HttpPorts pulumi.StringArrayInput `pulumi:"httpPorts"`
	// Specifies whether to enable the HTTP back-to-origin feature. After this feature is enabled, the WAF instance can use HTTP to forward HTTPS requests to the origin server.
	HttpToUserIp pulumi.StringInput `pulumi:"httpToUserIp"`
	// List of the HTTPS ports.
	HttpsPorts pulumi.StringArrayInput `pulumi:"httpsPorts"`
	// Specifies whether to redirect HTTP requests as HTTPS requests. Valid values: `On` and `Off`. Default to `Off`.
	HttpsRedirect pulumi.StringInput `pulumi:"httpsRedirect"`
	// The ID of domain self ID, value as `domainName`.
	Id pulumi.StringInput `pulumi:"id"`
	// Specifies whether to configure a Layer-7 proxy, such as Anti-DDoS Pro or CDN, to filter the inbound traffic before it is forwarded to WAF. Valid values: `On` and "Off". Default to `Off`.
	IsAccessProduct pulumi.StringInput `pulumi:"isAccessProduct"`
	// The load balancing algorithm that is used to forward requests to the origin. Valid values: `IpHash` and `RoundRobin`. Default to `IpHash`.
	LoadBalancing pulumi.StringInput `pulumi:"loadBalancing"`
	// The key-value pair that is used to mark the traffic that flows through WAF to the domain. Each item contains two field:
	LogHeaders GetDomainsDomainLogHeaderArrayInput `pulumi:"logHeaders"`
	// The read timeout of a WAF exclusive cluster. Unit: seconds.
	ReadTime pulumi.IntInput `pulumi:"readTime"`
	// The ID of the resource group to which the queried domain belongs in Resource Management.
	ResourceGroupId pulumi.StringInput `pulumi:"resourceGroupId"`
	// List of the IP address or domain of the origin server to which the specified domain points.
	SourceIps pulumi.StringArrayInput `pulumi:"sourceIps"`
	// The system data identifier that is used to control optimistic locking.
	Version pulumi.IntInput `pulumi:"version"`
	// The timeout period for a WAF exclusive cluster write connection. Unit: seconds.
	WriteTime pulumi.IntInput `pulumi:"writeTime"`
}

func (GetDomainsDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsDomain)(nil)).Elem()
}

func (i GetDomainsDomainArgs) ToGetDomainsDomainOutput() GetDomainsDomainOutput {
	return i.ToGetDomainsDomainOutputWithContext(context.Background())
}

func (i GetDomainsDomainArgs) ToGetDomainsDomainOutputWithContext(ctx context.Context) GetDomainsDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDomainsDomainOutput)
}

// GetDomainsDomainArrayInput is an input type that accepts GetDomainsDomainArray and GetDomainsDomainArrayOutput values.
// You can construct a concrete instance of `GetDomainsDomainArrayInput` via:
//
//	GetDomainsDomainArray{ GetDomainsDomainArgs{...} }
type GetDomainsDomainArrayInput interface {
	pulumi.Input

	ToGetDomainsDomainArrayOutput() GetDomainsDomainArrayOutput
	ToGetDomainsDomainArrayOutputWithContext(context.Context) GetDomainsDomainArrayOutput
}

type GetDomainsDomainArray []GetDomainsDomainInput

func (GetDomainsDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDomainsDomain)(nil)).Elem()
}

func (i GetDomainsDomainArray) ToGetDomainsDomainArrayOutput() GetDomainsDomainArrayOutput {
	return i.ToGetDomainsDomainArrayOutputWithContext(context.Background())
}

func (i GetDomainsDomainArray) ToGetDomainsDomainArrayOutputWithContext(ctx context.Context) GetDomainsDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDomainsDomainArrayOutput)
}

type GetDomainsDomainOutput struct{ *pulumi.OutputState }

func (GetDomainsDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsDomain)(nil)).Elem()
}

func (o GetDomainsDomainOutput) ToGetDomainsDomainOutput() GetDomainsDomainOutput {
	return o
}

func (o GetDomainsDomainOutput) ToGetDomainsDomainOutputWithContext(ctx context.Context) GetDomainsDomainOutput {
	return o
}

// The type of the WAF cluster.
func (o GetDomainsDomainOutput) ClusterType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.ClusterType }).(pulumi.StringOutput)
}

// The CNAME record assigned by the WAF instance to the specified domain.
func (o GetDomainsDomainOutput) Cname() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.Cname }).(pulumi.StringOutput)
}

// The connection timeout for WAF exclusive clusters. Valid values: `PhysicalCluster` and `VirtualCluster`. Default to `PhysicalCluster`.
func (o GetDomainsDomainOutput) ConnectionTime() pulumi.IntOutput {
	return o.ApplyT(func(v GetDomainsDomain) int { return v.ConnectionTime }).(pulumi.IntOutput)
}

// Field `domain` has been deprecated from version 1.94.0. Use `domainName` instead.
func (o GetDomainsDomainOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.Domain }).(pulumi.StringOutput)
}

// Name of the domain.
func (o GetDomainsDomainOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.DomainName }).(pulumi.StringOutput)
}

// List of the HTTP 2.0 ports.
func (o GetDomainsDomainOutput) Http2Ports() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainsDomain) []string { return v.Http2Ports }).(pulumi.StringArrayOutput)
}

// List of the HTTP ports.
func (o GetDomainsDomainOutput) HttpPorts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainsDomain) []string { return v.HttpPorts }).(pulumi.StringArrayOutput)
}

// Specifies whether to enable the HTTP back-to-origin feature. After this feature is enabled, the WAF instance can use HTTP to forward HTTPS requests to the origin server.
func (o GetDomainsDomainOutput) HttpToUserIp() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.HttpToUserIp }).(pulumi.StringOutput)
}

// List of the HTTPS ports.
func (o GetDomainsDomainOutput) HttpsPorts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainsDomain) []string { return v.HttpsPorts }).(pulumi.StringArrayOutput)
}

// Specifies whether to redirect HTTP requests as HTTPS requests. Valid values: `On` and `Off`. Default to `Off`.
func (o GetDomainsDomainOutput) HttpsRedirect() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.HttpsRedirect }).(pulumi.StringOutput)
}

// The ID of domain self ID, value as `domainName`.
func (o GetDomainsDomainOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.Id }).(pulumi.StringOutput)
}

// Specifies whether to configure a Layer-7 proxy, such as Anti-DDoS Pro or CDN, to filter the inbound traffic before it is forwarded to WAF. Valid values: `On` and "Off". Default to `Off`.
func (o GetDomainsDomainOutput) IsAccessProduct() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.IsAccessProduct }).(pulumi.StringOutput)
}

// The load balancing algorithm that is used to forward requests to the origin. Valid values: `IpHash` and `RoundRobin`. Default to `IpHash`.
func (o GetDomainsDomainOutput) LoadBalancing() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.LoadBalancing }).(pulumi.StringOutput)
}

// The key-value pair that is used to mark the traffic that flows through WAF to the domain. Each item contains two field:
func (o GetDomainsDomainOutput) LogHeaders() GetDomainsDomainLogHeaderArrayOutput {
	return o.ApplyT(func(v GetDomainsDomain) []GetDomainsDomainLogHeader { return v.LogHeaders }).(GetDomainsDomainLogHeaderArrayOutput)
}

// The read timeout of a WAF exclusive cluster. Unit: seconds.
func (o GetDomainsDomainOutput) ReadTime() pulumi.IntOutput {
	return o.ApplyT(func(v GetDomainsDomain) int { return v.ReadTime }).(pulumi.IntOutput)
}

// The ID of the resource group to which the queried domain belongs in Resource Management.
func (o GetDomainsDomainOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomain) string { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// List of the IP address or domain of the origin server to which the specified domain points.
func (o GetDomainsDomainOutput) SourceIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainsDomain) []string { return v.SourceIps }).(pulumi.StringArrayOutput)
}

// The system data identifier that is used to control optimistic locking.
func (o GetDomainsDomainOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v GetDomainsDomain) int { return v.Version }).(pulumi.IntOutput)
}

// The timeout period for a WAF exclusive cluster write connection. Unit: seconds.
func (o GetDomainsDomainOutput) WriteTime() pulumi.IntOutput {
	return o.ApplyT(func(v GetDomainsDomain) int { return v.WriteTime }).(pulumi.IntOutput)
}

type GetDomainsDomainArrayOutput struct{ *pulumi.OutputState }

func (GetDomainsDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDomainsDomain)(nil)).Elem()
}

func (o GetDomainsDomainArrayOutput) ToGetDomainsDomainArrayOutput() GetDomainsDomainArrayOutput {
	return o
}

func (o GetDomainsDomainArrayOutput) ToGetDomainsDomainArrayOutputWithContext(ctx context.Context) GetDomainsDomainArrayOutput {
	return o
}

func (o GetDomainsDomainArrayOutput) Index(i pulumi.IntInput) GetDomainsDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetDomainsDomain {
		return vs[0].([]GetDomainsDomain)[vs[1].(int)]
	}).(GetDomainsDomainOutput)
}

type GetDomainsDomainLogHeader struct {
	// The key of label.
	Key string `pulumi:"key"`
	// The value of label.
	Value string `pulumi:"value"`
}

// GetDomainsDomainLogHeaderInput is an input type that accepts GetDomainsDomainLogHeaderArgs and GetDomainsDomainLogHeaderOutput values.
// You can construct a concrete instance of `GetDomainsDomainLogHeaderInput` via:
//
//	GetDomainsDomainLogHeaderArgs{...}
type GetDomainsDomainLogHeaderInput interface {
	pulumi.Input

	ToGetDomainsDomainLogHeaderOutput() GetDomainsDomainLogHeaderOutput
	ToGetDomainsDomainLogHeaderOutputWithContext(context.Context) GetDomainsDomainLogHeaderOutput
}

type GetDomainsDomainLogHeaderArgs struct {
	// The key of label.
	Key pulumi.StringInput `pulumi:"key"`
	// The value of label.
	Value pulumi.StringInput `pulumi:"value"`
}

func (GetDomainsDomainLogHeaderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsDomainLogHeader)(nil)).Elem()
}

func (i GetDomainsDomainLogHeaderArgs) ToGetDomainsDomainLogHeaderOutput() GetDomainsDomainLogHeaderOutput {
	return i.ToGetDomainsDomainLogHeaderOutputWithContext(context.Background())
}

func (i GetDomainsDomainLogHeaderArgs) ToGetDomainsDomainLogHeaderOutputWithContext(ctx context.Context) GetDomainsDomainLogHeaderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDomainsDomainLogHeaderOutput)
}

// GetDomainsDomainLogHeaderArrayInput is an input type that accepts GetDomainsDomainLogHeaderArray and GetDomainsDomainLogHeaderArrayOutput values.
// You can construct a concrete instance of `GetDomainsDomainLogHeaderArrayInput` via:
//
//	GetDomainsDomainLogHeaderArray{ GetDomainsDomainLogHeaderArgs{...} }
type GetDomainsDomainLogHeaderArrayInput interface {
	pulumi.Input

	ToGetDomainsDomainLogHeaderArrayOutput() GetDomainsDomainLogHeaderArrayOutput
	ToGetDomainsDomainLogHeaderArrayOutputWithContext(context.Context) GetDomainsDomainLogHeaderArrayOutput
}

type GetDomainsDomainLogHeaderArray []GetDomainsDomainLogHeaderInput

func (GetDomainsDomainLogHeaderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDomainsDomainLogHeader)(nil)).Elem()
}

func (i GetDomainsDomainLogHeaderArray) ToGetDomainsDomainLogHeaderArrayOutput() GetDomainsDomainLogHeaderArrayOutput {
	return i.ToGetDomainsDomainLogHeaderArrayOutputWithContext(context.Background())
}

func (i GetDomainsDomainLogHeaderArray) ToGetDomainsDomainLogHeaderArrayOutputWithContext(ctx context.Context) GetDomainsDomainLogHeaderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDomainsDomainLogHeaderArrayOutput)
}

type GetDomainsDomainLogHeaderOutput struct{ *pulumi.OutputState }

func (GetDomainsDomainLogHeaderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsDomainLogHeader)(nil)).Elem()
}

func (o GetDomainsDomainLogHeaderOutput) ToGetDomainsDomainLogHeaderOutput() GetDomainsDomainLogHeaderOutput {
	return o
}

func (o GetDomainsDomainLogHeaderOutput) ToGetDomainsDomainLogHeaderOutputWithContext(ctx context.Context) GetDomainsDomainLogHeaderOutput {
	return o
}

// The key of label.
func (o GetDomainsDomainLogHeaderOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomainLogHeader) string { return v.Key }).(pulumi.StringOutput)
}

// The value of label.
func (o GetDomainsDomainLogHeaderOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsDomainLogHeader) string { return v.Value }).(pulumi.StringOutput)
}

type GetDomainsDomainLogHeaderArrayOutput struct{ *pulumi.OutputState }

func (GetDomainsDomainLogHeaderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDomainsDomainLogHeader)(nil)).Elem()
}

func (o GetDomainsDomainLogHeaderArrayOutput) ToGetDomainsDomainLogHeaderArrayOutput() GetDomainsDomainLogHeaderArrayOutput {
	return o
}

func (o GetDomainsDomainLogHeaderArrayOutput) ToGetDomainsDomainLogHeaderArrayOutputWithContext(ctx context.Context) GetDomainsDomainLogHeaderArrayOutput {
	return o
}

func (o GetDomainsDomainLogHeaderArrayOutput) Index(i pulumi.IntInput) GetDomainsDomainLogHeaderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetDomainsDomainLogHeader {
		return vs[0].([]GetDomainsDomainLogHeader)[vs[1].(int)]
	}).(GetDomainsDomainLogHeaderOutput)
}

type GetInstancesInstance struct {
	// The timestamp (in seconds) indicating when the WAF instance expires.
	EndDate int `pulumi:"endDate"`
	// The ID of the WAF instance.
	Id string `pulumi:"id"`
	// Indicates whether the WAF instance has overdue payments.
	InDebt int `pulumi:"inDebt"`
	// The ID of WAF the instance.
	InstanceId string `pulumi:"instanceId"`
	// The number of days before the trial period of the WAF instance expires.
	RemainDay int `pulumi:"remainDay"`
	// The status of WAF instance to filter results. Optional value: `0`: The instance has expired, `1` : The instance has not expired and is working properly.
	Status           int    `pulumi:"status"`
	SubscriptionType string `pulumi:"subscriptionType"`
	// Indicates whether this is a trial instance.
	Trial int `pulumi:"trial"`
}

// GetInstancesInstanceInput is an input type that accepts GetInstancesInstanceArgs and GetInstancesInstanceOutput values.
// You can construct a concrete instance of `GetInstancesInstanceInput` via:
//
//	GetInstancesInstanceArgs{...}
type GetInstancesInstanceInput interface {
	pulumi.Input

	ToGetInstancesInstanceOutput() GetInstancesInstanceOutput
	ToGetInstancesInstanceOutputWithContext(context.Context) GetInstancesInstanceOutput
}

type GetInstancesInstanceArgs struct {
	// The timestamp (in seconds) indicating when the WAF instance expires.
	EndDate pulumi.IntInput `pulumi:"endDate"`
	// The ID of the WAF instance.
	Id pulumi.StringInput `pulumi:"id"`
	// Indicates whether the WAF instance has overdue payments.
	InDebt pulumi.IntInput `pulumi:"inDebt"`
	// The ID of WAF the instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// The number of days before the trial period of the WAF instance expires.
	RemainDay pulumi.IntInput `pulumi:"remainDay"`
	// The status of WAF instance to filter results. Optional value: `0`: The instance has expired, `1` : The instance has not expired and is working properly.
	Status           pulumi.IntInput    `pulumi:"status"`
	SubscriptionType pulumi.StringInput `pulumi:"subscriptionType"`
	// Indicates whether this is a trial instance.
	Trial pulumi.IntInput `pulumi:"trial"`
}

func (GetInstancesInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return i.ToGetInstancesInstanceOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceOutput)
}

// GetInstancesInstanceArrayInput is an input type that accepts GetInstancesInstanceArray and GetInstancesInstanceArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceArrayInput` via:
//
//	GetInstancesInstanceArray{ GetInstancesInstanceArgs{...} }
type GetInstancesInstanceArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput
	ToGetInstancesInstanceArrayOutputWithContext(context.Context) GetInstancesInstanceArrayOutput
}

type GetInstancesInstanceArray []GetInstancesInstanceInput

func (GetInstancesInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return i.ToGetInstancesInstanceArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceArrayOutput)
}

type GetInstancesInstanceOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return o
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return o
}

// The timestamp (in seconds) indicating when the WAF instance expires.
func (o GetInstancesInstanceOutput) EndDate() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.EndDate }).(pulumi.IntOutput)
}

// The ID of the WAF instance.
func (o GetInstancesInstanceOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Id }).(pulumi.StringOutput)
}

// Indicates whether the WAF instance has overdue payments.
func (o GetInstancesInstanceOutput) InDebt() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.InDebt }).(pulumi.IntOutput)
}

// The ID of WAF the instance.
func (o GetInstancesInstanceOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.InstanceId }).(pulumi.StringOutput)
}

// The number of days before the trial period of the WAF instance expires.
func (o GetInstancesInstanceOutput) RemainDay() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.RemainDay }).(pulumi.IntOutput)
}

// The status of WAF instance to filter results. Optional value: `0`: The instance has expired, `1` : The instance has not expired and is working properly.
func (o GetInstancesInstanceOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.Status }).(pulumi.IntOutput)
}

func (o GetInstancesInstanceOutput) SubscriptionType() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.SubscriptionType }).(pulumi.StringOutput)
}

// Indicates whether this is a trial instance.
func (o GetInstancesInstanceOutput) Trial() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.Trial }).(pulumi.IntOutput)
}

type GetInstancesInstanceArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstance {
		return vs[0].([]GetInstancesInstance)[vs[1].(int)]
	}).(GetInstancesInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainLogHeaderInput)(nil)).Elem(), DomainLogHeaderArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainLogHeaderArrayInput)(nil)).Elem(), DomainLogHeaderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetCertificatesCertificateInput)(nil)).Elem(), GetCertificatesCertificateArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetCertificatesCertificateArrayInput)(nil)).Elem(), GetCertificatesCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDomainsDomainInput)(nil)).Elem(), GetDomainsDomainArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDomainsDomainArrayInput)(nil)).Elem(), GetDomainsDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDomainsDomainLogHeaderInput)(nil)).Elem(), GetDomainsDomainLogHeaderArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDomainsDomainLogHeaderArrayInput)(nil)).Elem(), GetDomainsDomainLogHeaderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceInput)(nil)).Elem(), GetInstancesInstanceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceArrayInput)(nil)).Elem(), GetInstancesInstanceArray{})
	pulumi.RegisterOutputType(DomainLogHeaderOutput{})
	pulumi.RegisterOutputType(DomainLogHeaderArrayOutput{})
	pulumi.RegisterOutputType(GetCertificatesCertificateOutput{})
	pulumi.RegisterOutputType(GetCertificatesCertificateArrayOutput{})
	pulumi.RegisterOutputType(GetDomainsDomainOutput{})
	pulumi.RegisterOutputType(GetDomainsDomainArrayOutput{})
	pulumi.RegisterOutputType(GetDomainsDomainLogHeaderOutput{})
	pulumi.RegisterOutputType(GetDomainsDomainLogHeaderArrayOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceArrayOutput{})
}
