package gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class List extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Annotated implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ItemType = new javax.xml.namespace.QName( "", "itemType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Annotation = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "annotation", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SimpleType = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "simpleType", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.anonymous.types.complex.List" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public List() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected List( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation Annotation() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation) TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().getValue( this );
  }

  public void setAnnotation$( gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation param ) {
    TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Id() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().getValue( this );
  }

  public void setId$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().setValue( this, param );
  }


  public javax.xml.namespace.QName ItemType() {
    return (javax.xml.namespace.QName) TYPE.get().getTypeInfo().getProperty( "ItemType" ).getAccessor().getValue( this );
  }

  public void setItemType$( javax.xml.namespace.QName param ) {
    TYPE.get().getTypeInfo().getProperty( "ItemType" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.List_SimpleType SimpleType() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.List_SimpleType) TYPE.get().getTypeInfo().getProperty( "SimpleType" ).getAccessor().getValue( this );
  }

  public void setSimpleType$( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.List_SimpleType param ) {
    TYPE.get().getTypeInfo().getProperty( "SimpleType" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}
